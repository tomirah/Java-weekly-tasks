/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko4t2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileReader;

public class Mainclass
{
	public static void main(String[] args) {
		
		ReadAndWriteIO readandwrite = new ReadAndWriteIO();
		//readandwrite.readFile();
		readandwrite.readAndWrite();
	}
}