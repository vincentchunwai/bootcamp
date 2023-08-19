package AircraftBuilder;

public class AirIntakeSystem {
  private int AirCaptureRatio;
  private int AirCompressionRatio;
  private BoundaryControlLevel boundaryControlLevel;
  private AirFiltering airFiltering;


  public void setAirCaptureRatio(int AirCaptureRatio){
    this.AirCaptureRatio = AirCaptureRatio;
  }

  public void setAirCompressionRatio(int AirCompressionRatio){
    this.AirCompressionRatio = AirCompressionRatio;
  }
  public int getAirCaptureRatio(){
    return this.AirCaptureRatio;
  }

  public int getAirCompressionRatio(){
    return this.AirCompressionRatio;
  }

  public BoundaryControlLevel getBoundaryControlLevel(){
    return this.boundaryControlLevel;
  }

  public AirFiltering getAirFiltering(){
    return this.airFiltering;
  }


}
