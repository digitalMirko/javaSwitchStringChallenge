package com.digitalmirko;

/*
Challenge
Create a switch statement using strings that accept any case used in their name.
Allow it to test for a month call then print out a message when one of the
twelve months is chosen. But also mention when a name which is not a month
is chosen to show it doesn't exist.

Test for Months:
January, February, March, April, May, June, July, August, September, October, November, December

Test for Non-Months strings:
Tuesday, Weekend, Leap Year, Tomorrow
 */

public class Main {

    public static void main(String[] args) {

        String monthValue = "Leap Year";

        // converted every monthValue variable entered into a lower case value
        switch(monthValue.toLowerCase()){
            case "january":
                System.out.println("You chose January. Its the 1st month of the year and" +
                            "\nits name comes from the Roman God Janus.");
                break;
            case "february":
                System.out.println("You chose February. Its the shortest month of the year" +
                            "\nand its the third month of winter.");
                break;
            case "march":
                System.out.println("You chose March. It's named after Mars, the Roman God of war" +
                            "\nas it was the month when military campaigning started.");
                break;
            case "april":
                System.out.println("You chose April. The 4th month of the year that begins" +
                            "\nwith April Fool's Day. But also includes Earth Day too.");
                break;
            case "may":
                System.out.println("You chose May. It's named for Maia, the Greek goddess of fertility" +
                            "\nPlus in any year, no month ever begins or ends on the same day as May does.");
                break;
            case "june":
                System.out.println("You chose June. The first month of the summer season." +
                            "\nThe English tennis tournament Wimbledon is played in June.");
                break;
            case "july":
                System.out.println("You chose July. The 7th month of the year which brings us" +
                            "\nIndependence Day and Canada Day. In the Roman calendar its the 5th month.");
                break;
            case "august":
                System.out.println("You chose August. This month was named after Roman emperor" +
                            "\nAugustus Caesar. In Latin, augustus meant auspicious or venerable.");
                break;
            case "september":
                System.out.println("You chose September. Its the ninth month and has nice letters." +
                            "\nOn average more babies are born in the US then any other month.");
                break;
            case "october":
                System.out.println("You chose October. October literally translates to \"eighth month.\"" +
                            "\nMore US presidents have been born in this month than any other month.");
                break;
            case "november":
                System.out.println("You chose November. It's the 11th month of the year." +
                            "\nPlus its the most disagreeable month in the whole year.");
                break;
            case "december":
                System.out.println("You chose December. It comes from the Latin decem for \"ten\"" +
                            "\nbecause it was the 10th month in the Roman Calendar.");
                break;
            default:
                System.out.println("Sorry that's not a month name.");
                break;
        }
    }
}

/*
Output for "JaNUary":
You chose January. Its the 1st month of the year and
its name comes from the Roman God Janus.

Output for "FEBruary":
You chose February. Its the shortest month of the year
and its the third month of winter.

Output for "MARCH":
You chose March. It's named after Mars, the Roman God of war
as it was the month when military campaigning started.

Output for "ApriL":
You chose April. The 4th month of the year that begins
with April Fool's Day. But also includes Earth Day too.

Output for "MAy":
You chose May. It's named for Maia, the Greek goddess of fertility
Plus in any year, no month ever begins or ends on the same day as May does.

Output for "jUNe":
You chose June. The first month of the summer season.
The English tennis tournament Wimbledon is played in June.

Output for "JulY":
You chose July. The 7th month of the year which brings us
Independence Day and Canada Day. In the Roman calendar its the 5th month.

Output for "AUGust":
You chose August. This month was named after Roman emperor
Augustus Caesar. In Latin, augustus meant auspicious or venerable.

Output for "SEPTember":
You chose September. Its the ninth month and has nice letters.
On average more babies are born in the US then any other month.

Output for "OCTOBer":
You chose October. October literally translates to "eighth month."
More US presidents have been born in this month than any other month.

Output for "November":
You chose November. It's the 11th month of the year.
Plus its the most disagreeable month in the whole year.

Output for "DecEMber":
You chose December. It comes from the Latin decem for "ten"
because it was the 10th month in the Roman Calendar.

Output for "Tuesday":
Sorry that's not a month name.

Output for "Weekend":
Sorry that's not a month name.

Output for "Leap Year":
Sorry that's not a month name.

Output for "Tomorrow":
Sorry that's not a month name.

*/