package dto;

public class CategoryDTO {
    private int categoryId;
    private String categoryName;
    private boolean categoryStatus;
    
    public CategoryDTO () {
        
    }
    
    public CategoryDTO ( int categoryId ) {
        this.categoryId = categoryId;
    }
    
    public CategoryDTO ( int categoryId, boolean categoryStatus ) {
        this.categoryId = categoryId;
    }
    
    public CategoryDTO ( String categoryName, boolean categoryStatus ) {
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
    }
    
    public CategoryDTO ( int categoryId, String categoryName, boolean categoryStatus ) {
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
        this.categoryId = categoryId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" + "categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryStatus=" + categoryStatus + '}';
    }
    
}
