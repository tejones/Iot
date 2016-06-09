package com.redhat.iot.concurrent;

import com.redhat.iot.IotConstants.TestData;
import com.redhat.iot.IotException;
import com.redhat.iot.domain.IotNotification;
import com.redhat.iot.domain.Promotion;

/**
 * Task to retrieve {@link IotNotification}s.
 */
public class GetNotifications extends GetData< IotNotification > {

    /**
     * The OData URL used to obtain {@link Promotion}s.
     */
    private static final String NOTIFICATIONS_URL =
        String.format( GetData.URL_PATTERN, "getNotification?CustomerID=%s&$format=json" );

    /**
     * @param callback the callback (cannot be <code>null</code>)
     */
    public GetNotifications( final IotCallback< IotNotification > callback ) {
        super( NOTIFICATIONS_URL, callback, IotNotification.class, -1 );
    }

    @Override
    protected String getTestData() throws IotException {
        return TestData.NOTIFICATIONS;
    }

}
