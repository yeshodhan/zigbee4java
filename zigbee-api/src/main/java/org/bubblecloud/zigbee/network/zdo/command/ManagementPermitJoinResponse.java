package org.bubblecloud.zigbee.network.zdo.command;

import org.bubblecloud.zigbee.network.zdo.ZdoCommand;

/**
 * ManagementPermitJoinResponse.
 */
public class ManagementPermitJoinResponse extends ZdoCommand {
    /**
     * The status.
     */
    private int status;
    /**
     * The source address.
     */
    private int sourceAddress;

    public ManagementPermitJoinResponse() {
    }

    public ManagementPermitJoinResponse(int status, int sourceAddress) {
        this.sourceAddress = sourceAddress;
        this.status = status;
    }

    public int getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(int sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ManagementPermitJoinResponse " +
                "sourceAddress=" + sourceAddress +
                ", status=" + status;
    }
}
