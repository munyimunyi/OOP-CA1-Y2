/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodbridge.fooddonations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author SWitkowski
 *
 * DonationManager.java - stores donations, searches, deletes and saves them to
 * file
 */
public class DonationManager {

	private static final String FILE_NAME = "donations.txt";
	private static DonationManager instance;

	private final ArrayList<Donation> donations = new ArrayList<>();
	private int nextID = 1;

	public DonationManager() {
		load();
	}

	// single shared DonationManager instance, data stays after this.dispose() in GUI navigation
	public static DonationManager getInstance() {
		if (instance == null) {
			instance = new DonationManager();
		}
		return instance;
	}

	public int nextID() {
		return nextID++;
	}

	// add a donation
	public void add(Donation d) {
		donations.add(d);
		save();
	}

	// show all donations
	public ArrayList<Donation> getAll() {
		return donations;
	}

	// search through donations
	public ArrayList<Donation> search(String text) {
		ArrayList<Donation> found = new ArrayList<>();
		String t = text.trim().toLowerCase();

		// for each loop
		for (Donation d : donations) {
			if (d.getItemName().toLowerCase().contains(t) || d.getDonorName().toLowerCase().contains(t)) {
				found.add(d);
			}
		}
		return found;
	}

	public boolean delete(int id) {
		for (int i = 0; i < donations.size(); i++) {
			if (donations.get(i).getDonationID() == id) {
				donations.remove(i);

				// assumes list in ID order (works because IDs are given in sequence)
				for (int j = 0; j < donations.size(); j++) {
					donations.get(j).setDonationID(j + 1);
				}
				
				nextID = donations.size() + 1; // keep donations continuing from last ID
				save();
				return true;
			}
		}
		return false;
	}

	// save donations array to file
	public void save() {
		File outfile;
		FileWriter fw;
		BufferedWriter bw;

		try {
			outfile = new File(FILE_NAME);
			fw = new FileWriter(outfile); // file is rewritten every time
			bw = new BufferedWriter(fw);

			for (Donation d : donations) {
				bw.write(d.toFileLine());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}
	}

	// load donations array from file
	public void load() {
		File infile;
		FileReader fr;
		BufferedReader br;
		String line;

		try {
			infile = new File(FILE_NAME);
			fr = new FileReader(infile);
			br = new BufferedReader(fr);

			line = br.readLine();
			while (line != null) {
				FoodDonations d = FoodDonations.fromFileLine(line);
				if (d != null) {
					donations.add(d);
					nextID = Math.max(nextID, d.getDonationID() + 1);
				}
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// no donations.txt yet, so there is nothing to load
		} catch (IOException e) {
			System.out.println("Error reading from file: " + e.getMessage());
		}
	}

}
