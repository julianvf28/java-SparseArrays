package co.julianvalencia.sparsearrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SparseArrays {

    public static void main(String[] args) {
        System.out.println("Buscar un array en otro");
        
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "abcde","sdaklfj","asdjf","na","basdn","sdaklfj","asdjf","na","asdjf","na","basdn","sdaklfj","asdjf");
        
        List<String> queries = new ArrayList<>();
        Collections.addAll(queries, "abcde","sdaklfj","asdjf","na","basdn");
        
        List<Integer> result = matchingStrings(stringList, queries);
        
        System.out.println(result);
        
    }
    
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        int CantStringList      = stringList.size();
        int CantQueries         = queries.size();
        List<Integer> result    = new ArrayList<>();

        //primer for para recorrer queries
        for ( int i=0 ; i<CantQueries ; i++ ){
            result.add( i, 0);
            //segundo for para recorrer array stringList
            for ( int j=0; j<CantStringList ; j++){

                //if de validación
                if ( queries.get(i).equals(stringList.get(j) ) ) {
                    result.set( i, result.get(i)+1 );
                }
            }
        }
        return result;
    }

}
