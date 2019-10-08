class Pos{
  public int row;
  public int col;
  
  public Pos(int mrow,int mcol){
    this.row=mrow;
    this.col=mcol;
  }
  
  public String toString(){    
      return "["+this.row+","+this.col+"]";
  }
  @Override
  public boolean equals(Object other){
      if(other instanceof Pos){
          if(other.row==this.row && other.col == this.col){
              return true;
          }
      }
      return false;
  }
}
