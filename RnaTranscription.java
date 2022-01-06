class RnaTranscription {
2
    String transcribe(String dna) {
3
        try {
4
            String rna1 = new String("");
5
            for(int i=0; i<dna.length(); i++) {
6
                    char c = dna.charAt(i);
7
                    switch(c) {
8
                        case 'G': rna1 += 'C';
9
                            break;
10
    
11
                        case 'C': rna1 += 'G';
12
                            break;
13
    
14
                        case 'T': rna1 += 'A';
15
                            break;
16
    
17
                        case 'A': rna1 += 'U';
18
                            break;
19
                    }
20
            }   
21
            return rna1;
22
        }
23
        catch(UnsupportedOperationException e) {
24
            throw new UnsupportedOperationException ();
25
        }
26
    }
27
}