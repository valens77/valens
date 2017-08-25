/**
 * 
 */
package com.valens.base.designPattern.Builder;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater     
 * @updateDate 
 * @remark
 * @version v1.0
 */
public class ProductBuilder extends AbsProductBuilder {
	ProductCook product=new ProductCook();
	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Builder.AbsProductBuilder#builderProduct()
	 */
	@Override
	ProductCook builderProduct() {
		// TODO Auto-generated method stub
		return product;
	}
	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Builder.AbsProductBuilder#builderProductPartA()
	 */
	@Override
	void builderProductPartA() {
		product.setPartA("放油");
	}
	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Builder.AbsProductBuilder#builderProductPartB()
	 */
	@Override
	void builderProductPartB() {
		product.setPartB("放肉");
	}
	/* (non-Javadoc)
	 * @see com.valens.base.designPattern.Builder.AbsProductBuilder#builderProductPartC()
	 */
	@Override
	void builderProductPartC() {
		product.setPartC("放盐");
		
	}

}

