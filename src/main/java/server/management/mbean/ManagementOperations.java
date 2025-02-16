package server.management.mbean;


import clientApi.*;
import clientApi.mbean.ManagementOperationsMBean;
import server.management.ManagementService;

public class ManagementOperations implements ManagementOperationsMBean {

    private final ManagementService mngmntService;

    public ManagementOperations(ManagementService mngmntService) {
        this.mngmntService = mngmntService;
    }

    @Override
    public Response send(Request request) throws ManagementException {
        return mngmntService.execute(request);
    }
}
