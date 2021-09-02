/*consulta para saber cuantos viajes tuvo cierto vehiculo*/
select distinct(viaje.fecha) as Fecha_viaje from vehiculo
join conductor on vehiculo.veh_placa = conductor.veh_placa
join viaje on conductor.usu_cc = viaje.con_cc where vehiculo.veh_placa = "KGH 211";