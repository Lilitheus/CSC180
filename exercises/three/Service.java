
public interface Service<T> {

	public T create(T model);
	T retreive(Integer id);
	T update(T model, Integer id);
	void delete(Integer id);
}
