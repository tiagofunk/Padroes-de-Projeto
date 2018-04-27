package factory.concrete;

import factory.model.CarroPopular;
import factory.model.CarroSedan;
import factory.model.FabricaCarros;

public class FabricaCarrosVolks implements FabricaCarros {

	@Override
	public CarroPopular getCarroPopular(int ano, int velocidade) {
		return new Gol(ano, velocidade);
	}

	@Override
	public CarroSedan getCarroSedan(int ano, int velocidade, double tamanhoPortaMalas) {
		return new Voyage(ano, velocidade, tamanhoPortaMalas);
	}

}
