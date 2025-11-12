class highest_attitude {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int maxAlt = 0; 
        for (int g : gain) {
            alt += g;
            if (alt > maxAlt) maxAlt = alt;
        }
        return maxAlt;
    }
}
