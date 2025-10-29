import { Component } from '@angular/core';
import { IProduto } from '../../../interfaces/IProduto';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from '../../../services/ProductService';

@Component({
  selector: 'app-product-form',
  standalone: false,
  templateUrl: './product-form.html',
  styleUrl: './product-form.css',
})
export class ProductForm {

  produto: IProduto = {
    id: null,
    nome: '',
    preco: 0,
    quantidade: 0
  };

  isEdicao: boolean = false;

  constructor(
    private produtoService: ProductService,
    private activeRoute: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    const id = Number(this.activeRoute.snapshot.paramMap.get('id'));
    if (id && id != 0) {
      this.isEdicao = true;
      this.produtoService.findById(id).subscribe(response => {
        this.produto = response;
      });
    }
  }

  save(): void {
    if (this.isEdicao) {
      this.produtoService.update(this.produto).subscribe(() => {
        this.router.navigate(['/produtos']);
      });
    } else {
      this.produtoService.add(this.produto).subscribe(() => {
        this.router.navigate(['/produtos']);
      });
    }
  }

}
