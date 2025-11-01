/**
 * 
 */
package com.common.exceptions;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.common.constants.Constants;
import com.common.models.ResponseModel;
import com.common.utility.CommonUtils;




/**
 * 
 */
@ControllerAdvice
public class TCustomException extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<>(responseModel, status);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<>(responseModel, status);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<>(responseModel, status);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<>(responseModel, status);
	}

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<>(responseModel, status);
	}

	@Override
	protected ResponseEntity<Object> handleConversionNotSupported(ConversionNotSupportedException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<>(responseModel, status);
	}

	@Override
	protected ResponseEntity<Object> handleAsyncRequestTimeoutException(AsyncRequestTimeoutException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<>(responseModel, status);
	}

	@Override
	protected ResponseEntity<Object> handleErrorResponseException(ErrorResponseException ex, HttpHeaders headers,
			HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<>(responseModel, status);
	}

	@ExceptionHandler(InvalidInputException.class)
	public ResponseEntity<ResponseModel> invalidInputException(InvalidInputException ex) {

		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(AuthenticationFailedException.class)
	public ResponseEntity<ResponseModel> authenticationFailedException(AuthenticationFailedException ex) {

		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ResponseModel> dataNotFoundException(DataNotFoundException ex) {

		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(TException.class)
	public ResponseEntity<ResponseModel> tException(TException ex) {

		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<ResponseModel> databaseException(DatabaseException ex) {

		ResponseModel responseModel = new ResponseModel();

		responseModel.setStatus(Constants.Error.FAILURE);
		responseModel.setData(CommonUtils.getError(ex.getMessage()));

		return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
