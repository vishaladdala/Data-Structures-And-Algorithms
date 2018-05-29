public class Vector2D implements Iterator<Integer> {
    
    int indexList;
    int indexEle;
    List<List<Integer>> vec;
    
    public Vector2D(List<List<Integer>> vec2d) {
        indexList = 0;
        indexEle = 0;
        vec = vec2d;
    }

    @Override
    public Integer next() {
        return vec.get(indexList).get(indexEle++);
    }

    @Override
    public boolean hasNext() {
        while( indexList < vec.size()){
            if( indexEle < vec.get(indexList).size()){
                return true;
            }
            else{
                indexList++;
                indexEle = 0;
            }
        
        }
        return false;
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */