using LoopinApi.Models;
using Microsoft.EntityFrameworkCore;
using System.Reflection;

namespace LoopinApi.Data
{
    public class AppDbContext : DbContext
    {
        public AppDbContext(DbContextOptions<AppDbContext> options) : base(options) { }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            // Obtém todos os tipos de classes do namespace LoopinApi.Models
            var entityTypes = Assembly.GetExecutingAssembly()
                .GetTypes()
                .Where(t => t.IsClass && !t.IsAbstract && t.Namespace == "LoopinApi.Models");

            // Adiciona cada entidade ao ModelBuilder
            foreach (var type in entityTypes)
            {
                //modelBuilder.Entity(type);
                modelBuilder.Model.AddEntityType(type);
            }

            base.OnModelCreating(modelBuilder);
        }
    }
}
