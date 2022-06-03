package co.com.uco.sistemainventario.servicio.credito.creacion.impl;

import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.entidad.Credito;
import co.com.uco.sistemainventario.persistencia.CreditoRepository;
import co.com.uco.sistemainventario.servicio.credito.creacion.CreacionServicioCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreacionServicioCreditoImpl implements CreacionServicioCredito {

    @Autowired
    private CreditoRepository creditoRepository;

    @Override
    public Integer ejecutar(Credito credito) {
        credito.setValorCuota(consultarValorCuota(credito));
        creditoRepository.save(credito);
        return credito.getIdCredito();
    }

    public double consultarValorCuota(Credito credito) {
        return consultarValor(credito);
    }

    private double consultarValor(Credito credito) {
        int numeroCuotas = credito.getNumeroCuotas();
        double valorMotocicleta = credito.getValorMoto();
        double valorCuotaInicial = credito.getValorCuotaInicial();
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
            case 21:
                return 0.07393;
            case 22:
                return 0.07187;
            case 23:
                return 0.070001;
            case 24:
                return 0.0683;
            case 25:
                return 0.066747;
            case 26:
                return 0.065323;
            case 27:
                return 0.064016;
            case 28:
                return 0.062812;
            case 29:
                return 0.0617;
            case 30:
                return 0.060671;
            case 31:
                return 0.059718;
            case 32:
                return 0.058832;
            case 33:
                return 0.058008;
            case 34:
                return 0.05724;
            case 35:
                return 0.056523;
            case 36:
                return 0.052869;
            default:
                return 0.05286;
        }
    }
}
