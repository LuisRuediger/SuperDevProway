import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Aluno } from './components/Aluno/Aluno';
import { AlunoLista } from './components/aluno-lista/aluno-lista';
import { BotaoExibicao } from './components/botao-exibicao/botao-exibicao';

@NgModule({
  declarations: [
    App,
    Aluno,
    AlunoLista,
    BotaoExibicao
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners()
  ],
  bootstrap: [App]
})
export class AppModule { }
