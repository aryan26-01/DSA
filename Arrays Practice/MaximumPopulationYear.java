
// Q. https://leetcode.com/problems/maximum-population-year/

class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int max_people = 0;
        int min_year = 1950;

        for (int year = 1950; year <= 2050; year++) {
            int curr_people = 0;

            // Alive Count in a current year
            for (int i = 0; i < logs.length; i++) {
                int birth = logs[i][0];
                int death = logs[i][1];
                if (birth <= year && year < death) {
                    curr_people++;
                }
            }

            if (curr_people > max_people) {
                max_people = curr_people;
                min_year = year;
            }
        }

        return min_year;
    }
}
