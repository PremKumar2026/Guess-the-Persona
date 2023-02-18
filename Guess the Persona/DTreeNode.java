

public class DTreeNode {

    /***********************************************************************
     * Solution for step 6
     ***********************************************************************/
     private String text;
     private boolean isAnswer;
     private DTreeNode nodeForNo;
     private DTreeNode nodeForYes;
     
     public DTreeNode(String initText, boolean initIsAnswer, DTreeNode initNodeForNo, DTreeNode initNodeForYes){
         text = initText;
         isAnswer = initIsAnswer;
         nodeForNo = initNodeForNo;
         nodeForYes = initNodeForYes;
     }
     
     public DTreeNode(String initText, boolean initIsAnswer){
         text = initText;
         isAnswer = initIsAnswer;
         nodeForNo = null;
         nodeForYes = null;
     }
     
     public String getText(){
         return text;
     }
     
     public boolean getIsAnswer(){
         return isAnswer;
     }
     
     public DTreeNode getNodeForNo(){
         return nodeForNo;
     }
     
     public DTreeNode getNodeForYes(){
         return nodeForYes;
     }
     
     public void setNodeForNo(DTreeNode nNodeForNo){
         nodeForNo = nNodeForNo;
     }
     
     public void setNodeForYes(DTreeNode nNodeForYes){
         nodeForYes = nNodeForYes;
     }
    /***********************************************************************
     * End of solution for step 6
     ***********************************************************************/
     
    /******************************************************************************
     * Given code
     ******************************************************************************/
        
    public double getAverageNumQuestions() {
        return getSumNumQuestions(0) / 9.0; // Assumes there are 9 personas
    }
    
    private int getSumNumQuestions(int numSoFar) {
        if (text.equals("unknown"))
            return 0;
        else if (isAnswer)
            return numSoFar;
        else
            return nodeForNo.getSumNumQuestions(numSoFar+1) + nodeForYes.getSumNumQuestions(numSoFar+1);
    }
    
    public String toString() {
        return toStringRec(0);
    }
    
    protected String toStringRec(int level) {
        String indent = new String(new char[level]).replace("\0", "    "); // https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string-in-java
        if (isAnswer)
            return indent + text;
        else {
            return indent + text + "?" + "\n" + indent + "No " + text + ":\n" + nodeForNo.toStringRec(level+1) 
                                       + "\n" + indent + "Yes " + text + ":\n" + nodeForYes.toStringRec(level+1);
        }
    }
    /***********************************************************************
     * End of given code
     ***********************************************************************/
    
}
