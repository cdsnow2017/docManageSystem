package edu.ynu.docmanagesystem.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Md5Generator {

	public static void main(String[] args) {
		String string = new Md5Hash("2013", "qwer", 2).toString();
		System.err.println(string);

	}

}
