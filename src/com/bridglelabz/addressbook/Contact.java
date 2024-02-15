package com.bridglelabz.addressbook;
import java.util.*;

    class Contact {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String phoneNumber;
        private String email;

        // Constructor
        public Contact(String firstName, String lastName, String address, String city, String state, String zip,
                       String phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String email) {
            this.zip = zip;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }


        public String toString() {
            return "Contact{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zip='" + zip + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
    class AddressBook{
        private ArrayList<Contact> contacts;
        public AddressBook(){
            this.contacts=new ArrayList<>();
        }
        public void addContact (Contact contact){
            contacts.add(contact);
            System.out.println("Contact add successfully");
        }
        public void editContact(String firstName,String lastName,Contact newContact) {
            for (Contact contact : contacts) {
                if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                    contact.setFirstName(newContact.getFirstName());
                    contact.setLastName(newContact.getLastName());
                    contact.setAddress(newContact.getAddress());
                    contact.setCity(newContact.getCity());
                    contact.setState(newContact.getPhoneNumber());
                    contact.setEmail(newContact.getEmail());
                    System.out.println("contact editied successfully");
                    return;
                }
            }
            System.out.println("contact not found");
        }
        public void deleteContact(String firstName, String lastName) {
            for (Contact contact : contacts) {
                if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                    contacts.remove(contact);
                    System.out.println("Contact deleted successfully.");
                    return;
                }
            }
            System.out.println("Contact not found.");
        }
        public void displayContacts(){
            for(Contact contact : contacts){
                System.out.println(contact);
            }
        }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.next();
                    System.out.print("Enter address: ");
                    String address = scanner.next();
                    System.out.print("Enter city: ");
                    String city = scanner.next();
                    System.out.print("Enter state: ");
                    String state = scanner.next();
                    System.out.print("Enter zip: ");
                    String zip = scanner.next();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    addressBook.addContact(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
                    break;
                case 2:
                    System.out.print("Enter first name of contact to edit: ");
                    String editFirstName = scanner.next();
                    System.out.print("Enter last name of contact to edit: ");
                    String editLastName = scanner.next();
                    System.out.print("Enter new first name: ");
                    String newFirstName = scanner.next();
                    System.out.print("Enter new last name: ");
                    String newLastName = scanner.next();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.next();
                    System.out.print("Enter new city: ");
                    String newCity = scanner.next();
                    System.out.print("Enter new state: ");
                    String newState = scanner.next();
                    System.out.print("Enter new zip: ");
                    String newZip = scanner.next();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.next();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.next();
                    addressBook.editContact(editFirstName, editLastName, new Contact(newFirstName, newLastName, newAddress, newCity, newState, newZip, newPhoneNumber, newEmail));
                    break;
                case 3:
                    System.out.print("Enter first name of contact to delete: ");
                    String deleteFirstName = scanner.next();
                    System.out.print("Enter last name of contact to delete: ");
                    String deleteLastName = scanner.next();
                    addressBook.deleteContact(deleteFirstName, deleteLastName);
                    break;
                case 4:
                    addressBook.displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }}
