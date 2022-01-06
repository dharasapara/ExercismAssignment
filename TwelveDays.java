class TwelveDays {
    String verse(int verseNum) {
        String res = new String("On the ");
        
        switch(verseNum) {
            case 1 : res += "first "; break;
            case 2 : res += "second "; break;
            case 3 : res += "third "; break;
            case 4 : res += "fourth "; break;
            case 5 : res += "fifth "; break;
            case 6 : res += "sixth "; break;
            case 7 : res += "seventh "; break;
            case 8 : res += "eighth "; break;
            case 9 : res += "ninth "; break;
            case 10 : res += "tenth "; break;
            case 11 : res += "eleventh "; break;
            case 12 : res += "twelfth "; break;
        }
        res += "day of Christmas my true love gave to me: ";

        switch(verseNum) {
            case 12: res += "twelve Drummers Drumming, ";
            case 11: res += "eleven Pipers Piping, ";
            case 10: res += "ten Lords-a-Leaping, ";
            case 9: res += "nine Ladies Dancing, ";
            case 8: res += "eight Maids-a-Milking, ";
            case 7: res += "seven Swans-a-Swimming, ";
            case 6: res += "six Geese-a-Laying, ";
            case 5: res += "five Gold Rings, ";
            case 4: res += "four Calling Birds, ";
            case 3: res += "three French Hens, ";
            case 2: res += "two Turtle Doves, and ";
            case 1: res += "a Partridge in a Pear Tree.\n";
        }
        return res;
    }

    String verses(int startVerse, int endVerse) {
        String res = new String();
        for(int i=startVerse; i<endVerse; i++) {
            res += verse(i) + "\n";
        }
        res += verse(endVerse);
        return res;
    }
    
    String sing() {
        String res = new String();
        for(int i=1; i<12; i++) {
            res += verse(i) + "\n";
        }
        res += verse(12);
        return res;
    }
}
