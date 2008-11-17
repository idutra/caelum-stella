package br.com.caelum.stella.validation.error;

import br.com.caelum.stella.validation.InvalidValue;

/**
 * 
 * Representa possíveis erros do Titulo de Eleitor.
 * 
 * @author Leonardo Bessa
 */
public enum TituloDeEleitorError implements InvalidValue {
    INVALID_CHECK_DIGITS, INVALID_FORMAT, INVALID_CODIGO_DE_ESTADO
}
