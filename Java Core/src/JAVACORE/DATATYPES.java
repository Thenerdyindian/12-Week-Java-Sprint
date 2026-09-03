package JAVACORE;

public class DATATYPES {
        public static void main(String[] args) {

            // --- 1. INTEGER TYPES (Whole Numbers) ---
            byte age = 24;                     // 8-bit: ranges from -128 to 127
            short salary = 32000;              // 16-bit: ranges from -32,768 to 32,767
            int targetLPA = 1000000;           // 32-bit: the default choice for whole numbers
            long databaseId = 9876543210L;     // 64-bit: must end with 'L' or 'l'

            // --- 2. FLOATING-POINT TYPES (Decimals) ---
            float interestRate = 7.5f;         // 32-bit precision: must end with 'f' or 'F'
            double exactPi = 3.14159265359;    // 64-bit precision: default choice for decimals

            // --- 3. CHARACTER TYPE ---
            char grade = 'A';                  // Single 16-bit Unicode character, single quotes

            // --- 4. BOOLEAN TYPE ---
            boolean isJavaFun = true;          // Strictly holds true or false

            // --- 5. REFERENCE TYPE (Class) ---
            String sprintName = "Day 1 of 12-Week Backend Sprint"; // Double quotes for text

            // --- PRINTING THE VALUES ---
            System.out.println("Byte (age): " + age);
            System.out.println("Short (salary): " + salary);
            System.out.println("Int (LPA): " + targetLPA);
            System.out.println("Long (DB ID): " + databaseId);
            System.out.println("Float (Rate): " + interestRate);
            System.out.println("Double (Pi): " + exactPi);
            System.out.println("Char (Grade): " + grade);
            System.out.println("Boolean (Is Fun?): " + isJavaFun);
            System.out.println("String (Goal): " + sprintName);
        }
    }

