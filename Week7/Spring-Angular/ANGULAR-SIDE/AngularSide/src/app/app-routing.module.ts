import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { SecretPageComponent } from './secret-page/secret-page.component';
import { SessionGuard } from './session.guard';



const routes: Routes = [
  { path: 'secret', component: SecretPageComponent, canActivate: [SessionGuard] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
