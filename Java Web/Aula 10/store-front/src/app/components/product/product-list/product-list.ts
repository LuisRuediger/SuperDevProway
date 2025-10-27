import { Component } from '@angular/core';
import { IProduto } from '../../../interfaces/IProduto';
import { ProductService } from '../../../services/ProductService';

@Component({
  selector: 'app-product-list',
  standalone: false,
  templateUrl: './product-list.html',
  styleUrl: './product-list.css',
})
export class ProductList {

  products: IProduto[] = [];

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts(): void {
    this.productService.findAll().subscribe(response => {
      this.products = response;
    });
  }

  delete(id: number): void {
    this.productService.delete(id).subscribe(() => {
      this.getProducts();
    });
  }

}
