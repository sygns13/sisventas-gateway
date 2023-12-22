package com.bcs.gateway.sisventasgateway.utils;

public class Constantes {

    public static final Integer REGISTRO_ACTIVO = 1;
    public static final Integer REGISTRO_INACTIVO = 0;

    public static final Integer REGISTRO_BORRADO = 1;
    public static final Integer REGISTRO_NO_BORRADO = 0;
    public static final Integer REGISTRO_NO_BORRADO_2_DEFAULT = 2;

    public static final String SUPER_ADMINISTRADOR = "1";

    public static final Long ALMACEN_GENERAL = 0L;
    public static final String CANTIDAD_UNIDAD = "1";

    public static final Integer CANTIDAD_ZERO = 0;
    public static final Integer CANTIDAD_MINIMA_PAGE = 5;
    public static final Integer CANTIDAD_UNIDAD_INTEGER = 1;

    public static final Double CANTIDAD_ZERO_DOUBLE = 0.0;

    public static final Double CANTIDAD_UNIDAD_DOUBLE = 1.0;

    public static final Double CANTIDAD_CIEN_DOUBLE = 100.0;

    public static final Long CANTIDAD_ZERO_LONG = 0L;

    public static final Long CANTIDAD_UNIDAD_LONG = 1L;

    //Intreso Retiro Lotes
    public static final Integer TIPO_ENTRADA_PRODUCTOS = 1;
    public static final Integer TIPO_RETIRO_PRODUCTOS = 0;
    public static final String MOTIVO_INGRESO_CREACION_LOTE = "Ingreso de Productos por Creación de Lote en el Módulo de Gestión de Stocks";
    public static final String MOTIVO_SALIDA_ELIMINACION_LOTE = "Salida de Productos por Eliminación de Lote en el Módulo de Gestión de Stocks";
    public static final String MOTIVO_INGRESO_MODIFICACION_LOTE = "Ingreso de Productos por Modificación de Lote en el Módulo de Gestión de Stocks";
    public static final String MOTIVO_SALIDA_MODIFICACION_LOTE = "Salida de Productos por Modificación de Lote en el Módulo de Gestión de Stocks";

    //Intreso Retiro Stocks
    public static final Long ID_INGRESO_SALIDA_STOCK_NO_LOTE = 0L;
    public static final String MOTIVO_INGRESO_CREACION_STOCK = "Ingreso de Productos por Definición de Nuevo Stock en el Módulo de Gestión de Stocks";
    public static final String MOTIVO_INGRESO_MODIFICACION_STOCK = "Ingreso de Productos por Modificación de Stock en el Módulo de Gestión de Stocks";
    public static final String MOTIVO_SALIDA_MODIFICACION_STOCK = "Salida de Productos por Modificación de Stock en el Módulo de Gestión de Stocks";
}
