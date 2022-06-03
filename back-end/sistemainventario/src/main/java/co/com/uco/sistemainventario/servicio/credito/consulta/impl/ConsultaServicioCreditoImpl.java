package co.com.uco.sistemainventario.servicio.credito.consulta.impl;

import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.entidad.Credito;
import co.com.uco.sistemainventario.persistencia.CreditoRepository;
import co.com.uco.sistemainventario.servicio.credito.consulta.ConsultaServicioCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServicioCreditoImpl implements ConsultaServicioCredito {

    @Autowired
    private CreditoRepository creditoRepository;

    @Override
    public Iterable<Credito> findAll() {
        return creditoRepository.findAll();
    }

    @Override
    public double consultarValorCuota(ComandoCredito comandoCredito) {
        return consultarValor(comandoCredito);
    }

    private double consultarValor(ComandoCredito comandoCredito) {
        int numeroCuotas = comandoCredito.getNumeroCuotas();
        double valorMotocicleta = comandoCredito.getValorMoto();
        double valorCuotaInicial = comandoCredito.getValorCuotaInicial();
        double valorAFinanciar = valorMotocicleta - valorCuotaInicial;
        double factorCuota = obtenerFactor(numeroCuotas);
        return valorAFinanciar*factorCuota;
    }

    private double obtenerFactor(int numeroCuotas) {
        switch (numeroCuotas) {
            case 1 :
                return 1.044;
            case 2:
                return 0.533237;
            case 3 :
                return 0.363088;
            case 4:
                return 0.2780892;
            case 5 :
                return 0.227157;
            case 6:
                return 0.193253;
            case 7 :
                return 0.169081;
            case 8:
                return 0.150991;
            case 9 :
                return 0.136955;
            case 10:
                return 0.125758;
            case 11 :
                return 0.116625;
            case 12:
                return 0.10904;
            case 13 :
                return 0.102645;
            case 14:
                return 0.097186;
            case 15 :
                return 0.092475;
            case 16:
                return 0.088372;
            case 17 :
                return 0.084769;
            case 18:
                return 0.081583;
            case 19 :
                return 0.078748;
            case 20:
                return 0.076211;
            default:
                return 0.07393;
        }
    }
}
