/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
HOSTEL JAVA
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Hostel {
    private String hostelId;
    private String hostelName;
    private String accommodationType;
    private double rentalPrice;
    private String occupancyStatus;
    private double latitude;
    private double longitude;

    // Constructor
    public Hostel(String hostelId, String hostelName, String accommodationType,
                  double rentalPrice, String occupancyStatus, double latitude, double longitude) {
        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.accommodationType = accommodationType;
        this.rentalPrice = rentalPrice;
        this.occupancyStatus = occupancyStatus;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters
    public String getHostelId() { return hostelId; }
    public String getHostelName() { return hostelName; }
    public String getAccommodationType() { return accommodationType; }
    public double getRentalPrice() { return rentalPrice; }
    public String getOccupancyStatus() { return occupancyStatus; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }

    // Method to display hostel details formatted cleanly
    public void displayInfo() {
        System.out.printf("ID: %-5s | Name: %-22s | Type: %-28s | Price: UGX %,10.0f | Status: %-18s | Coords: (%.6f, %.6f)%n",
                hostelId, hostelName, accommodationType, rentalPrice, occupancyStatus, latitude, longitude);
    }
}


MAIN
public class Main {
    public static void main(String[] args) {
        // Storing records H11 to H23 in an array
        Hostel[] hostels = {
            new Hostel("H11", "Lugoba Hostel", "Not self-contained (Single)", 400000, "Partially Occupied", 0.603820, 32.477415),
            new Hostel("H12", "Blue Sheets Hostel", "Self-contained (Single)", 700000, "Occupied", 0.604356, 32.477067),
            new Hostel("H13", "Sofi Hostel", "Self-contained (Single)", 1200000, "Partially Occupied", 0.602728, 32.477070),
            new Hostel("H14", "Bwino Hostel", "Not self-contained (Single)", 400000, "Occupied", 0.602028, 32.477371),
            new Hostel("H15", "Elpa 2 Hostel", "Self-contained", 900000, "Partially Occupied", 0.600560, 32.477305),
            new Hostel("H16", "HRJ Hostel", "Half self-contained (Single)", 600000, "Occupied", 0.603452, 32.477063),
            new Hostel("H17", "Cartase Hostels 1", "Half self-contained (Single)", 800000, "Occupied", 0.606779, 32.474204),
            new Hostel("H18", "Bessaniya Hostel", "Half self-contained (Single)", 500000, "Partially Occupied", 0.606586, 32.474156),
            new Hostel("H19", "Shalom 2", "Half self-contained (Single)", 500000, "Occupied", 0.606191, 32.474177),
            new Hostel("H20", "K Zone Hostels", "Not self-contained (Single)", 400000, "Vacant", 0.612053, 32.477079),
            new Hostel("H21", "K Zone", "Not self-contained (Single)", 400000, "Vacant", 0.616528, 32.472695),
            new Hostel("H22", "Lamoze Hostels", "Self-contained (Single)", 600000, "Occupied", 0.615244, 32.466976),
            new Hostel("H23", "Nkwine Hostels", "Not self-contained (Single)", 300000, "Partially Occupied", 0.618756, 32.473324)
        };

        System.out.println("=============================================================================================================");
        System.out.println("                               HOSTEL MAPPING DATASET (RECORDS H11 - H23)                                    ");
        System.out.println("=============================================================================================================");

        double totalRentalPrice = 0;
        int occupiedCount = 0;
        int partiallyOccupiedCount = 0;
        int vacantCount = 0;

        for (Hostel h : hostels) {
            h.displayInfo();
            totalRentalPrice += h.getRentalPrice();

            switch (h.getOccupancyStatus().toLowerCase()) {
                case "occupied":
                    occupiedCount++;
                    break;
                case "partially occupied":
                    partiallyOccupiedCount++;
                    break;
                case "vacant":
                    vacantCount++;
                    break;
            }
        }

        double averagePrice = totalRentalPrice / hostels.length;

        System.out.println("\n-------------------------------------------------------------------------------------------------------------");
        System.out.println("                                              STATISTICAL SUMMARY                                            ");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.printf("Total Hostel Records Processed : %d%n", hostels.length);
        System.out.printf("Total Combined Rental Price   : UGX %,12.2f%n", totalRentalPrice);
        System.out.printf("Average Rental Price          : UGX %,12.2f%n", averagePrice);
        System.out.printf("Occupancy Breakdown           : %d Occupied | %d Partially Occupied | %d Vacant%n",
                occupiedCount, partiallyOccupiedCount, vacantCount);
        System.out.println("=============================================================================================================");
    }
}


OUTPUT
run:
=============================================================================================================
                               HOSTEL MAPPING DATASET (RECORDS H11 - H23)                                    
=============================================================================================================
ID: H11   | Name: Lugoba Hostel          | Type: Not self-contained (Single)  | Price: UGX    400,000 | Status: Partially Occupied | Coords: (0.603820, 32.477415)
ID: H12   | Name: Blue Sheets Hostel     | Type: Self-contained (Single)      | Price: UGX    700,000 | Status: Occupied           | Coords: (0.604356, 32.477067)
ID: H13   | Name: Sofi Hostel            | Type: Self-contained (Single)      | Price: UGX  1,200,000 | Status: Partially Occupied | Coords: (0.602728, 32.477070)
ID: H14   | Name: Bwino Hostel           | Type: Not self-contained (Single)  | Price: UGX    400,000 | Status: Occupied           | Coords: (0.602028, 32.477371)
ID: H15   | Name: Elpa 2 Hostel          | Type: Self-contained               | Price: UGX    900,000 | Status: Partially Occupied | Coords: (0.600560, 32.477305)
ID: H16   | Name: HRJ Hostel             | Type: Half self-contained (Single) | Price: UGX    600,000 | Status: Occupied           | Coords: (0.603452, 32.477063)
ID: H17   | Name: Cartase Hostels 1      | Type: Half self-contained (Single) | Price: UGX    800,000 | Status: Occupied           | Coords: (0.606779, 32.474204)
ID: H18   | Name: Bessaniya Hostel       | Type: Half self-contained (Single) | Price: UGX    500,000 | Status: Partially Occupied | Coords: (0.606586, 32.474156)
ID: H19   | Name: Shalom 2               | Type: Half self-contained (Single) | Price: UGX    500,000 | Status: Occupied           | Coords: (0.606191, 32.474177)
ID: H20   | Name: K Zone Hostels         | Type: Not self-contained (Single)  | Price: UGX    400,000 | Status: Vacant             | Coords: (0.612053, 32.477079)
ID: H21   | Name: K Zone                 | Type: Not self-contained (Single)  | Price: UGX    400,000 | Status: Vacant             | Coords: (0.616528, 32.472695)
ID: H22   | Name: Lamoze Hostels         | Type: Self-contained (Single)      | Price: UGX    600,000 | Status: Occupied           | Coords: (0.615244, 32.466976)
ID: H23   | Name: Nkwine Hostels         | Type: Not self-contained (Single)  | Price: UGX    300,000 | Status: Partially Occupied | Coords: (0.618756, 32.473324)

-------------------------------------------------------------------------------------------------------------
                                              STATISTICAL SUMMARY                                            
-------------------------------------------------------------------------------------------------------------
Total Hostel Records Processed : 13
Total Combined Rental Price   : UGX 7,700,000.00
Average Rental Price          : UGX   592,307.69
Occupancy Breakdown           : 6 Occupied | 5 Partially Occupied | 2 Vacant
=============================================================================================================
BUILD SUCCESSFUL (total time: 0 seconds)
