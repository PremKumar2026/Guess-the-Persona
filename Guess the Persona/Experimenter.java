


public class Experimenter {
    
    public static void main(String[] args) {
        Experimenter exp = new Experimenter();
        double numQuestions = 0;

        numQuestions = exp.examineRandomTree(15, true);
        System.out.println("This random tree asks, on average, " + numQuestions + " questions to identify the persona.");
        
        
        //Uncomment the code below as you're working in step 8.
        exp.examineManyRandomTrees();
    
        
        
        // Uncomment the code below as you're working in step 9.
        numQuestions = exp.examineVeryGoodTree(true);
        System.out.println("This very good tree asks, on average, " + numQuestions + " questions to identify the persona.");
        
    }
    
    private AlgorithmicDTreeFactory factory;
    
    public Experimenter() {
        factory = new AlgorithmicDTreeFactory();
    }
    
    public double examineRandomTree(int seed, boolean printTree) {
        factory.setChooseRandomly(true);
        factory.setSeed(seed);
        
        DTreeNode root = factory.build9PersonaTree();
        
        if (printTree)
            System.out.println(root);
        
        return root.getAverageNumQuestions();
    }
    
    public void examineManyRandomTrees() {
        System.out.println("===== Starting the randomExperiment method =====");
        int numSeedsToTry = 10;
        int currentSeed = 0;
        double numQuestions;
        while (currentSeed < numSeedsToTry) {
            System.out.println("--------------------");
            System.out.print("Seed: " + currentSeed + ", ");
            numQuestions = examineRandomTree(currentSeed, false);
            System.out.println("asks " + numQuestions + " on average.");
            currentSeed++;
        }
    }
    
    public double examineVeryGoodTree(boolean printTree) {
        factory.setChooseRandomly(false);
        DTreeNode root = factory.build9PersonaTree();
        
        if (printTree)
            System.out.println(root);
        
        return root.getAverageNumQuestions();
    }
     
}
