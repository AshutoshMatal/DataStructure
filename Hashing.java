import java.util.Scanner;

public class Hashing
{	
	public class HashNode {
		 int data;
		 HashNode next;
		 int count = 0;
		 }
		
		 HashNode head;
		 HashNode tail;
		
		 public Hashing() {
		 this.head = null;
		 this.tail = null;
		 }
		
		 public void delete_given_value(int data1) {
		 HashNode temp = head;
		 HashNode temp2 = head;
		 int flag = 0;
		 while (temp.next != null) {
		 // if (temp.next.data.compareTo(data1) != 0) {//For the String value
		 if (temp.next.data != data1) {
		 flag = 1;
		 } else {
		 flag = 0;
		 break;
		 }
		 temp = temp.next;
		 }
		
		 if (flag == 0) {
		 temp2 = temp.next;
		 System.out.println("Data found so deleting the data:");
		 temp.next = temp2.next;
		 } else {
		 System.out.println("Data not found so inserting the data");
		 insert_given_value(data1);
		 }
		
		 }
		
		 // inserting given data in linklist
		 public void insert_given_value(int data1) {
		 HashNode temp = head;
		 HashNode temp2 = new HashNode();
		 int flag = 0;
		 while (temp.next != null) {
		 // int data_conv = Integer.parseInt(temp.next.data);
		 // int data1_conv = Integer.parseInt(data1);
		 if (data1 > temp.next.data) {
		 flag = 0;
		 // break;
		 } else {
		 flag = 1;
		 break;
		 }
		 temp = temp.next;
		 }
		 if (flag == 1) {
		 temp2.data = data1;
		 temp2.next = temp.next;
		 temp.next = temp2;
		
		 }
		 else
		 {
		 LinkHashTable(data1);
		 }
		 }
		
		 public void LinkHashTable(int data1) {
		 HashNode temp = new HashNode();
		 // if linklist is empty create a new one
		 if (head == null) {
		 temp.data = data1;
		 temp.next = null;
		 head = temp;
		 tail = temp;
		
		 } else {
		 temp.data = data1;
		 tail.next = temp;
		 temp.next = null;
		 tail = temp;
		 }
		
		 }
		
		 public void displayFromStart() {
		 HashNode temp = head;
		 while (temp != null) {
		 System.out.print(temp.data + " ");
		
		 temp = temp.next;
		 }
		
		}
		
		 public static void main(String arg[]) {
		
		 Scanner scanner = new Scanner(System.in);
		 Hashing hashing[] = new Hashing[10];
		 int count[] = new int[10];
		 for (int i = 0; i < hashing.length; i++) {
		 if (hashing[i] == null) {
		 hashing[i] = new Hashing();
		 hashing[i].LinkHashTable(i);
		 count[i] = 0;
		 }
		 }
		 try {
		 while (true) {
		 System.out.println();
		 System.out.println("press '1' to continue or '0' to stop");
		 char choice = scanner.next().charAt(0);
		 switch (choice) {
		 case '1':
		 System.out.println();
		 System.out.println("1.add\n2.display");
		 int choice2 = scanner.nextInt();
		 switch (choice2) {
		 case 1:
		 System.out.println("Enter number to insert in hashing table");
		 int number = scanner.nextInt();
		 int rem = number % 11;
		 for (int i = 0; i < hashing.length; i++) {
		 if (rem == i) {
		 if (count[i] == 0) {
		 hashing[rem].LinkHashTable(number);
		 count[i] = count[i] + 1;
		 } else {
		 // System.out.println("hello");
		 hashing[rem].delete_given_value(number);
		 }
		 }
		 }
		
		 break;
		 case 2:
		
		 for (int i = 0; i < hashing.length; i++) {
		 hashing[i].displayFromStart();
		 System.out.println();
		 }
		 }
		
		 break;
		 case '0':
		 System.out.println();
		 System.exit(0);
		 default:
		 System.out.println("Enter a valid option");
		 }
		 }
		
		 } catch (Exception e) {
		 // TODO: handle exception
		 System.out.println("error" + e);
		 }
		 }
		
		}


