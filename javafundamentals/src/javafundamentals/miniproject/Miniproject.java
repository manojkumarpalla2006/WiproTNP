package javafundamentals;

public class Miniproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int EmpNo[] = {1001, 1002, 1003, 1004, 1005, 1006, 1007};

        String EmpName[] = {
                "Ashish",
                "Sushma",
                "Rahul",
                "Chahat",
                "Ranjan",
                "Suman",
                "Tanmay"
        };

        String JoinDate[] = {
                "01/04/2009",
                "23/08/2012",
                "12/11/2008",
                "29/01/2013",
                "16/07/2005",
                "01/01/2000",
                "12/06/2006"
        };

        char DesgCode[] = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};

        String Dept[] = {
                "R&D",
                "PM",
                "Acct",
                "Front Desk",
                "Engg",
                "Manufacturing",
                "PM"
        };

        int Basic[] = {20000, 30000, 10000, 12000, 50000, 23000, 29000};

        int Hra[] = {8000, 12000, 8000, 6000, 20000, 9000, 12000};

        int It[] = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        int EmpId = Integer.parseInt(args[0]);

        int index = -1;

        // Search Employee
        for (int i = 0; i < EmpNo.length; i++) {
            if (EmpNo[i] == EmpId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("There is no employee with empid : " + EmpId);
        } else {

            int Da = 0;
            String Designation = "";

            switch (DesgCode[index]) {

                case 'e':
                    Designation = "Engineer";
                    Da = 20000;
                    break;

                case 'c':
                    Designation = "Consultant";
                    Da = 32000;
                    break;

                case 'k':
                    Designation = "Clerk";
                    Da = 12000;
                    break;

                case 'r':
                    Designation = "Receptionist";
                    Da = 15000;
                    break;

                case 'm':
                    Designation = "Manager";
                    Da = 40000;
                    break;
            }

            int salary = Basic[index] + Hra[index] + Da - It[index];

            System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\tSalary");
            System.out.println(EmpNo[index] + "\t" +
                    EmpName[index] + "\t\t" +
                    Dept[index] + "\t\t" +
                    Designation + "\t\t" +
                    salary);
        }
    }
}