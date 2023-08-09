package domain;

public class Category {
    
    private int categoryId;
    private String categoryName;
    private boolean categoryStatus;
    
    public Category () {
        
    }
    
    public Category ( int categoryId ) {
        this.categoryId = categoryId;
    }
    
    public Category ( String categoryName, boolean categoryStatus ) {
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
    }
    
    public void setCategoryId ( int categoryId ) {
        this.categoryId = categoryId;
    }
    
    public int getCategoryId () {
        return this.categoryId;
    }
    
    public void setCategoryName ( String categoryName ) {
        this.categoryName = categoryName;
    }
    
    public String getCategoryName () {
        return this.categoryName;
    }
    
    public void setCategoryStatus ( boolean categoryStatus ) {
        this.categoryStatus = categoryStatus;
    }
    
    public boolean getCategoryStatus () {
        return this.categoryStatus;
    }

    @Override
    public String toString() {
        return "Category{" + "categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryStatus=" + categoryStatus + '}';
    }
    
}
