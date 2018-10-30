import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

public class DatatypeFactoryPooledObject
		extends BasePooledObjectFactory<DatatypeFactory> {

	@Override
	public DatatypeFactory create() {
		try {
			return DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Use the default PooledObject implementation.
	 */
	@Override
	public PooledObject<DatatypeFactory> wrap(DatatypeFactory datatypeFactory) {
		return new DefaultPooledObject<DatatypeFactory>(datatypeFactory);
	}

	/**
	 * When an object is returned to the pool, clear the buffer.
	 */
	@Override
	public void passivateObject(PooledObject<DatatypeFactory> pooledObject) {
		// System.out.println("passivated....");
	}

}
