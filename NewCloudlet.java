
package org.cloudbus.cloudsim.examples;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.UtilizationModel;
public class NewCloudlet extends Cloudlet {
private int cloudlet_priority=0;
public NewCloudlet(int cloudletId, long cloudletLength, int pesNumber, long
cloudletFileSize,

long cloudletOutputSize, UtilizationModel utilizationModelCpu,

UtilizationModel utilizationModelRam,

UtilizationModel utilizationModelBw) {
super(cloudletId, cloudletLength, pesNumber, cloudletFileSize,

cloudletOutputSize, utilizationModelCpu,

utilizationModelRam, utilizationModelBw);

// TODO Auto-generated constructor stub
}
public NewCloudlet(int cloudletId, long cloudletLength, int pesNumber, long
cloudletFileSize, long cloudletOutputSize, UtilizationModel utilizationModelCpu,

UtilizationModel utilizationModelRam, UtilizationModel utilizationModelBw, int
priority) {

super(cloudletId, cloudletLength, pesNumber, cloudletFileSize,

cloudletOutputSize, utilizationModelCpu, utilizationModelRam,
utilizationModelBw);

this.cloudlet_priority = priority;

}
public int getCloudlet_priority() {
return cloudlet_priority;

}
public void setCloudlet_priority(int cloudlet_priority) {
this.cloudlet_priority = cloudlet_priority;

}
}