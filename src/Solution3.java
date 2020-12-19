import java.util.ArrayList;
import java.util.List;

class Solution3 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if ( numRows == 0){
            return res;
        }

        res.add(new ArrayList<>());
        res.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow= res.get(i-1);
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1)+prevRow.get(j));

            }
            row.add(1);
            res.add(row);
        }
        return  res;
    }
}
