import java.util.HashMap;
import java.util.Map;


public abstract class AbstractService<T> implements Service<T> {
	
	protected Map<Integer, T> models = new HashMap<Integer, T>();

	@Override
	public T create(T model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T retreive(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T model, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		models.remove(id);

	}

}
