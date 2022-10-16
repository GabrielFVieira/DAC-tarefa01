package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;
import java.time.LocalTime;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {

	private String aut;
	private String lang;
	private String msg;

	public MessageBean() {
	}

	public String getAut() {
		return "José Viterbo";
	}

	public void setLang(String value) {
		lang = value;
	}

	public String getMsg() {
		LocalTime time = LocalTime.now();
		int hour = time.getHour();

		// Change the greeting based on the system time
		if (hour >= 0 && hour < 12) {
			return getMorningGreeting();
		} else if (hour >= 12 && hour < 18) {
			return getAfternoonGreeting();
		}
		
		return getNightGreeting();
	}

	public String getCreatedBy() {
		switch (this.lang) {
		case "pt":
			return "Elaborado por";
		case "en":
			return "Created by";
		case "de":
			return "Erstellt von";
		case "fr":
			return "Créé par";
		}
		return "";
	}
	
	public String getUpdatedBy() {
		switch (this.lang) {
		case "pt":
			return "Atualizado por";
		case "en":
			return "Updated by";
		case "de":
			return "Aktualisiert von";
		case "fr":
			return "Mis à jour par";
		}
		return "";
	}

	public String getMorningGreeting() {
		switch (this.lang) {
		case "pt":
			return "Bom dia";
		case "en":
			return "Good morning";
		case "de":
			return "Guten Morgen";
		case "fr":
			return "Bonjour";
		}

		return "";
	}

	public String getAfternoonGreeting() {
		switch (this.lang) {
		case "pt":
			return "Boa tarde";
		case "en":
			return "Good afternoon";
		case "de":
			return "Guten Nachmittag";
		case "fr":
			return "Bon après-midi";
		}

		return "";
	}

	public String getNightGreeting() {
		switch (this.lang) {
		case "pt":
			return "Boa noite";
		case "en":
			return "Good night";
		case "de":
			return "Guten Abend";
		case "fr":
			return "Bonsoir";
		}

		return "";
	}
}
