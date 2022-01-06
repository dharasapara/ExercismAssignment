class RnaTranscription {
    String transcribe(String dna) {
        try {
            String rna1 = new String("");
            for(int i=0; i<dna.length(); i++) {
                    char c = dna.charAt(i);
                    switch(c) {
                        case 'G': rna1 += 'C';
                            break;
    
                        case 'C': rna1 += 'G';
                            break;
    
                        case 'T': rna1 += 'A';
                            break;
    
                        case 'A': rna1 += 'U';
                            break;
                    }
            }   
            return rna1;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException ();
        }
    }
}
