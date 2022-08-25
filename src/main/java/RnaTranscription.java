import java.lang.String;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        for(int i=0;i< dnaStrand.length(); i++){
            if(dnaStrand.charAt(i) == 'G')
                rnaStrand = rnaStrand.concat("C");
            if(dnaStrand.charAt(i) == 'C')
                rnaStrand = rnaStrand.concat("G");
            if(dnaStrand.charAt(i) == 'T')
                rnaStrand = rnaStrand.concat("A");
            if(dnaStrand.charAt(i) == 'A')
                rnaStrand = rnaStrand.concat("U");
        }
        return rnaStrand;
    }

}
