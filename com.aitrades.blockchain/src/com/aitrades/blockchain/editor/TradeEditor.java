package com.aitrades.blockchain.editor;

import java.math.BigInteger;

public class TradeEditor {

	private String from;
	private String to;
	private BigInteger gasEth;
	private BigInteger gasPriceEth;
	private BigInteger quatity;
	private String data;
	private BigInteger nonce;
	private BigInteger gasPremiumEth;
	private BigInteger feeCapEth;

	private BigInteger gasUSD;
	private BigInteger gasPriceUSD;
	private BigInteger gasPremiumUSD;
	private BigInteger feeCapUSD;
	private Double slippageTolerance;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigInteger getGasEth() {
		return gasEth;
	}
	public void setGasEth(BigInteger gasEth) {
		this.gasEth = gasEth;
	}
	public BigInteger getGasPriceEth() {
		return gasPriceEth;
	}
	public void setGasPriceEth(BigInteger gasPriceEth) {
		this.gasPriceEth = gasPriceEth;
	}
	public BigInteger getQuatity() {
		return quatity;
	}
	public void setQuatity(BigInteger quatity) {
		this.quatity = quatity;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public BigInteger getNonce() {
		return nonce;
	}
	public void setNonce(BigInteger nonce) {
		this.nonce = nonce;
	}
	public BigInteger getGasPremiumEth() {
		return gasPremiumEth;
	}
	public void setGasPremiumEth(BigInteger gasPremiumEth) {
		this.gasPremiumEth = gasPremiumEth;
	}
	public BigInteger getFeeCapEth() {
		return feeCapEth;
	}
	public void setFeeCapEth(BigInteger feeCapEth) {
		this.feeCapEth = feeCapEth;
	}
	public BigInteger getGasUSD() {
		return gasUSD;
	}
	public void setGasUSD(BigInteger gasUSD) {
		this.gasUSD = gasUSD;
	}
	public BigInteger getGasPriceUSD() {
		return gasPriceUSD;
	}
	public void setGasPriceUSD(BigInteger gasPriceUSD) {
		this.gasPriceUSD = gasPriceUSD;
	}
	public BigInteger getGasPremiumUSD() {
		return gasPremiumUSD;
	}
	public void setGasPremiumUSD(BigInteger gasPremiumUSD) {
		this.gasPremiumUSD = gasPremiumUSD;
	}
	public BigInteger getFeeCapUSD() {
		return feeCapUSD;
	}
	public void setFeeCapUSD(BigInteger feeCapUSD) {
		this.feeCapUSD = feeCapUSD;
	}
	public Double getSlippageTolerance() {
		return slippageTolerance;
	}
	public void setSlippageTolerance(Double slippageTolerance) {
		this.slippageTolerance = slippageTolerance;
	}
	
	
}
