public class EBook extends Book{
    private String downloadUrl;
    private double sizeMB;

    public EBook() {
        this.downloadUrl = null;
        this.sizeMB = 0.0;
    }
    public EBook(String downloadUrl, double sizeMB) {
        this.downloadUrl = downloadUrl;
        this.sizeMB = sizeMB;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    public void setSizeMB(double sizeMB) {
        this.sizeMB = sizeMB;
    }
    public String getDownloadUrl() {
        return downloadUrl;
    }
    public double getSizeMB() {
        return sizeMB;
    }
    @Override
    public String toString() {
        return super.toString() + "\nDownload Url: " + this.downloadUrl + "\nSize: " + this.sizeMB + "MB";
    }
}
