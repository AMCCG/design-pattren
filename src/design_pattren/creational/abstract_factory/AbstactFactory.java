package design_pattren.creational.abstract_factory;

public abstract interface AbstactFactory<T> {

	public T create(String type);

}
