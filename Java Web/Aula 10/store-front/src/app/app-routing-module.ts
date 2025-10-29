import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductList } from './components/product/product-list/product-list';
import { ProductForm } from './components/product/product-form/product-form';

const routes: Routes = [
  {path: 'produtos', component: ProductList},
  {path: 'produto/novo', component: ProductForm},
  {path: 'produto/editar/:id', component: ProductForm},
  {path: '', redirectTo: '/produtos', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
