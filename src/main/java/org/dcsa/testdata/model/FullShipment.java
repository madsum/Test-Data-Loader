package org.dcsa.testdata.model;

import lombok.Data;

@Data
public class FullShipment {
    private ShipmentEvent shipmentEvent;
    private EquipmentEvent equipmentEvent;
    private TransportEvent transportEvent;
}
