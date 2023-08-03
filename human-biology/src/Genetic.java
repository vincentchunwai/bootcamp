import java.util.Random;

public class Genetic {
  private String[] genes;
  private int chromosomeCount;
  private int geneCount;

  public Genetic( int chromosomeCount, int geneCount){
    this.chromosomeCount = chromosomeCount;
    this.geneCount = geneCount;
    this.genes = new String[chromosomeCount * geneCount];
    initializeGenes();
  }

  public void initializeGenes(){
    String[] possibleGenes = {"A", "T", "C", "G"};
    Random random = new Random();

    for(int i = 0; i < genes.length; i++){
      genes[i] = possibleGenes[random.nextInt(4)];
    }
  }

  public String[] getGenes(){
    return genes;
  }

  public int getChromosomeCount(){
    return chromosomeCount;
  }

  public int getGeneCount(){
    return geneCount;
  }

  public String getGene(int chromosome, int geneIndex){
    if (chromosome < 1 || chromosome > chromosomeCount){
      throw new IllegalArgumentException("Invalid chromosome or gene index");
    }

    int index = (chromosome -1) * geneCount + (geneIndex - 1);
    return genes[index];
  }
}
