import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String> proteinas = new ArrayList<>();

        List<String> partes = dividirString(rnaSequence, 3);

        proteinas = adicionarProteinas(partes);


        return proteinas;
    }

    public static List<String> adicionarProteinas(List<String> partes){

        List<String> proteinas = new ArrayList<>();

        for (String part : partes){

            if(part.length() != 3 ){
                throw new IllegalArgumentException("Invalid codon");
            }else if(Objects.equals(part, "AUG")){
                proteinas.add("Methionine");
            }else if(Objects.equals(part, "UUU") || Objects.equals(part, "UUC")){
                proteinas.add("Phenylalanine");
            }else if(Objects.equals(part, "UUA") || Objects.equals(part, "UUG")){
                proteinas.add("Leucine");
            }else if(Objects.equals(part, "UCU") || Objects.equals(part, "UCC") || Objects.equals(part, "UCA") || Objects.equals(part, "UCG")){
                proteinas.add("Serine");
            }else if(Objects.equals(part, "UAU") || Objects.equals(part, "UAC")){
                proteinas.add("Tyrosine");
            }else if(Objects.equals(part, "UGU") || Objects.equals(part, "UGC")){
                proteinas.add("Cysteine");
            }else if(Objects.equals(part, "UGG")){
                proteinas.add("Tryptophan");
            }else if(Objects.equals(part, "UAA") || Objects.equals(part, "UAG") || Objects.equals(part, "UGA")){
                return proteinas;
            }else{
                throw new IllegalArgumentException("Invalid codon");
            }


        }

        return proteinas;

    }

    public static List<String> dividirString(String input, int tamanho) {
        List<String> partes = new ArrayList<>();


        for (int i = 0; i < input.length(); i += tamanho) {
            int endIndex = Math.min(i + tamanho, input.length());
            partes.add(input.substring(i, endIndex));
        }

        return partes;
    }
}