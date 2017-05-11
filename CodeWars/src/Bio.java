/**
 * Created by rcooper2 on 4/21/2017.
 *
 * Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four
 * nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
 *
 * Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical
 * structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
 *
 * Create a funciton which translates a given DNA string into RNA.
 *
 * For example:
 *
 * new Bio().dnaToRna("GCAT") // returns "GCAU"
 */
public class Bio {

    public static void main(String[] args){

        System.out.println(dnaToRna("GCAT"));
    }

    public static String dnaToRna(String dna){
        return dna.replaceAll("T", "U");
    }
}
