package Pyramids;

import java.util.List;

/**
 *
 * @author Emad Osama
 */
public interface PyramidsDao {
    public List<Pyramids> getAllPyramids();
    public Pyramids getPyramid(int num);   
    public void updatePyramid(Pyramids pyramid);
    public void deletePyramid(Pyramids pyramid);
    public Pyramids createPyramid (String [] metadata);
    public List<Pyramids> readPyramidsFromCsv(String filename);
    public void Sortfunction();
    public void mapfunction();
}
